package com.miroslavvidovic.goodreads_data;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.ParseDate;
import org.supercsv.cellprocessor.ParseDouble;
import org.supercsv.cellprocessor.ParseInt;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.ICsvBeanReader;
import org.supercsv.prefs.CsvPreference;
import com.miroslavvidovic.goodreads_data.Book;

public class CsvReader {
	
	public CsvReader() {}

    public static List<Book> bookList = new ArrayList<Book>();

    private static final String CSV_FILENAME = "src/main/java/data/goodreads.csv";
    
	private static CellProcessor[] getProcessors() {

        final CellProcessor[] processors = new CellProcessor[] {
        		new NotNull(),                             // id
                new NotNull(),                             // title
                new NotNull(),                             // author
                new NotNull(),                             // authorLastFirst
                new Optional(),                            // additionalAuthors
                new Optional(),                            // isbn
                new Optional(),                            // isbn13
                new Optional(new ParseDouble()),           // myRating
                new Optional(new ParseDouble()),           // averageRating
                new Optional(),                            // publisher
                new Optional(),                            // binding
                new Optional(new ParseInt()),              // numOfPages
                new Optional(new ParseInt()),              // yearPublished
                new Optional(new ParseInt()),              // originalPublicationYear
                new Optional(new ParseDate("yyyy/mm/dd")), // dateRead
                new Optional(new ParseDate("yyyy/mm/dd")), // dateAdded
                new Optional(),                            // bookshelf
                new Optional(),                            // bookshelvesWithPositions;
                new Optional(),                            // excluseveBookshelf;
                new Optional(),                            // myReview;
                new Optional(),                            // spoiler;
                new Optional(),                            // privateNotes;
                new Optional(),                            // readCount;
                new Optional(),                            // recommendedFor;
                new Optional(),                            // recommendedby;
                new Optional(),                            // ownedCopies;
                new Optional(),                            // originalPurchaseDate;
                new Optional(),                            // originalPurchaseLocation;
                new Optional(),                            // condition;
                new Optional(),                            // conditionDescription;
                new Optional()                             // bcid;
        };

        return processors;
    }

    public List<Book> readWithCsvBeanReader() throws Exception {

        ICsvBeanReader beanReader = null;
        try {
            beanReader = new CsvBeanReader(new FileReader(CSV_FILENAME), CsvPreference.STANDARD_PREFERENCE);

            final String[] header = beanReader.getHeader(true);
            // Mapping the csv column names to Book variables
            final String[] nameMapping = {"bookId", "title", "author", "authorLastFirst", "additionalAuthors", "ISBN", "ISBN13", "myRating",
            		"averageRating", "publisher", "binding", "numOfPages", "yearPublished", "originalPublicationYear", "dateRead", "dateAdded",
                    "bookshelves", "bookshelvesWithPositions", "exclusiveShelf", "myReview", "spoiler", "privateNotes", "readCount", "recommendedFor",
                    "recommededBy", "ownedCopies", "originalPurchaseDate", "originalPurchaseLocation", "condition", "conditionaDescription",
            		"bcid"};
            final CellProcessor[] processors = getProcessors();

            Book book;
            while( (book = beanReader.read(Book.class, nameMapping, processors)) != null ) {
                bookList.add(book);
            }

        }
        finally {
            if( beanReader != null ) {
                beanReader.close();
            }
        }
        
        return bookList;
    }
}
