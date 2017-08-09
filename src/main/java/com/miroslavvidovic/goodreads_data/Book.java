/*
 * 
 */
package com.miroslavvidovic.goodreads_data;

import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class Book.
 */
public class Book {
	
	/** The book id. */
	private String bookId;
	
	/** The title. */
	private String title;
	
	/** The author. */
	private String author;
	
	/** The author last first. */
	private String authorLastFirst;
	
	/** The additional authors. */
	private String additionalAuthors;
	
	/** The isbn. */
	private String ISBN;
	
	/** The isbn13. */
	private String ISBN13;
	
	/** The my rating. */
	private double myRating;
	
	/** The average rating. */
	private double averageRating;
	
	/** The publisher. */
	private String publisher;
	
	/** The binding. */
	private String binding;
	
	/** The num of pages. */
	private Integer numOfPages;
	
	/** The year published. */
	private Integer yearPublished;
	
	/** The original publication year. */
	private Integer originalPublicationYear;
	
	/** The date read. */
	private Date dateRead;
	
	/** The date added. */
	private Date dateAdded;
	
	/** The bookshelves. */
	private String bookshelves;
	
	/** The bookshelves with positions. */
	private String bookshelvesWithPositions;
	
	/** The exclusive shelf. */
	private String exclusiveShelf;
	
	/** The my review. */
	private String myReview;
	
	/** The spoiler. */
	private String spoiler;
	
	/** The private notes. */
	private String privateNotes;
	
	/** The read count. */
	private String readCount;
	
	/** The recommended for. */
	private String recommendedFor;
	
	/** The recommended by. */
	private String recommendedBy;
	
	/** The owned copies. */
	private String ownedCopies;
	
	/** The original purchase date. */
	private String originalPurchaseDate;
	
	/** The original purchase location. */
	private String originalPurchaseLocation;
	
	/** The condition. */
	private String condition;
	
	/** The condition description. */
	private String conditionDescription;
	
	/** The bcid. */
	private String bcid;
	
	/**
	 * Default constructor required for CsvReader.
	 */
	public Book() {
		
	}

	/**
	 * Gets the book id.
	 *
	 * @return the book id
	 */
	public String getBookId() {
		return bookId;
	}

	/**
	 * Sets the book id.
	 *
	 * @param bookId the new book id
	 */
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title.
	 *
	 * @param title the new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the author.
	 *
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the author.
	 *
	 * @param author the new author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * Gets the author last first.
	 *
	 * @return the author last first
	 */
	public String getAuthorLastFirst() {
		return authorLastFirst;
	}

	/**
	 * Sets the author last first.
	 *
	 * @param authorLastFirst the new author last first
	 */
	public void setAuthorLastFirst(String authorLastFirst) {
		this.authorLastFirst = authorLastFirst;
	}

	/**
	 * Gets the additional authors.
	 *
	 * @return the additional authors
	 */
	public String getAdditionalAuthors() {
		return additionalAuthors;
	}

	/**
	 * Sets the additional authors.
	 *
	 * @param additionalAuthors the new additional authors
	 */
	public void setAdditionalAuthors(String additionalAuthors) {
		this.additionalAuthors = additionalAuthors;
	}

	/**
	 * Gets the isbn.
	 *
	 * @return the isbn
	 */
	public String getISBN() {
		return ISBN;
	}

	/**
	 * Sets the isbn.
	 *
	 * @param iSBN the new isbn
	 */
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	/**
	 * Gets the isbn13.
	 *
	 * @return the isbn13
	 */
	public String getISBN13() {
		return ISBN13;
	}

	/**
	 * Sets the isbn13.
	 *
	 * @param iSBN13 the new isbn13
	 */
	public void setISBN13(String iSBN13) {
		ISBN13 = iSBN13;
	}

	/**
	 * Gets the my rating.
	 *
	 * @return the my rating
	 */
	public double getMyRating() {
		return myRating;
	}

	/**
	 * Sets the my rating.
	 *
	 * @param myRating the new my rating
	 */
	public void setMyRating(double myRating) {
		this.myRating = myRating;
	}

	/**
	 * Gets the average rating.
	 *
	 * @return the average rating
	 */
	public double getAverageRating() {
		return averageRating;
	}

	/**
	 * Sets the average rating.
	 *
	 * @param averageRating the new average rating
	 */
	public void setAverageRating(double averageRating) {
		this.averageRating = averageRating;
	}

	/**
	 * Gets the publisher.
	 *
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * Sets the publisher.
	 *
	 * @param publisher the new publisher
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * Gets the binding.
	 *
	 * @return the binding
	 */
	public String getBinding() {
		return binding;
	}

	/**
	 * Sets the binding.
	 *
	 * @param binding the new binding
	 */
	public void setBinding(String binding) {
		this.binding = binding;
	}

	/**
	 * Gets the num of pages.
	 *
	 * @return the num of pages
	 */
	public Integer getNumOfPages() {
		return numOfPages;
	}

	/**
	 * Sets the num of pages.
	 *
	 * @param numOfPages the new num of pages
	 */
	public void setNumOfPages(Integer numOfPages) {
		this.numOfPages = numOfPages;
	}

	/**
	 * Gets the year published.
	 *
	 * @return the year published
	 */
	public Integer getYearPublished() {
		return yearPublished;
	}

	/**
	 * Sets the year published.
	 *
	 * @param yearPublished the new year published
	 */
	public void setYearPublished(Integer yearPublished) {
		this.yearPublished = yearPublished;
	}

	/**
	 * Gets the original publication year.
	 *
	 * @return the original publication year
	 */
	public Integer getOriginalPublicationYear() {
		return originalPublicationYear;
	}

	/**
	 * Sets the original publication year.
	 *
	 * @param originalPublicationYear the new original publication year
	 */
	public void setOriginalPublicationYear(Integer originalPublicationYear) {
		this.originalPublicationYear = originalPublicationYear;
	}

	/**
	 * Gets the date read.
	 *
	 * @return the date read
	 */
	public Date getDateRead() {
		return dateRead;
	}

	/**
	 * Sets the date read.
	 *
	 * @param dateRead the new date read
	 */
	public void setDateRead(Date dateRead) {
		this.dateRead = dateRead;
	}

	/**
	 * Gets the date added.
	 *
	 * @return the date added
	 */
	public Date getDateAdded() {
		return dateAdded;
	}

	/**
	 * Sets the date added.
	 *
	 * @param dateAdded the new date added
	 */
	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	/**
	 * Gets the bookshelves.
	 *
	 * @return the bookshelves
	 */
	public String getBookshelves() {
		return bookshelves;
	}

	/**
	 * Sets the bookshelves.
	 *
	 * @param bookshelves the new bookshelves
	 */
	public void setBookshelves(String bookshelves) {
		this.bookshelves = bookshelves;
	}

	/**
	 * Gets the bookshelves with positions.
	 *
	 * @return the bookshelves with positions
	 */
	public String getBookshelvesWithPositions() {
		return bookshelvesWithPositions;
	}

	/**
	 * Sets the bookshelves with positions.
	 *
	 * @param bookshelvesWithPositions the new bookshelves with positions
	 */
	public void setBookshelvesWithPositions(String bookshelvesWithPositions) {
		this.bookshelvesWithPositions = bookshelvesWithPositions;
	}

	/**
	 * Gets the exclusive shelf.
	 *
	 * @return the exclusive shelf
	 */
	public String getExclusiveShelf() {
		return exclusiveShelf;
	}

	/**
	 * Sets the exclusive shelf.
	 *
	 * @param exclusiveShelf the new exclusive shelf
	 */
	public void setExclusiveShelf(String exclusiveShelf) {
		this.exclusiveShelf = exclusiveShelf;
	}

	/**
	 * Gets the my review.
	 *
	 * @return the my review
	 */
	public String getMyReview() {
		return myReview;
	}

	/**
	 * Sets the my review.
	 *
	 * @param myReview the new my review
	 */
	public void setMyReview(String myReview) {
		this.myReview = myReview;
	}

	/**
	 * Gets the spoiler.
	 *
	 * @return the spoiler
	 */
	public String getSpoiler() {
		return spoiler;
	}

	/**
	 * Sets the spoiler.
	 *
	 * @param spoiler the new spoiler
	 */
	public void setSpoiler(String spoiler) {
		this.spoiler = spoiler;
	}

	/**
	 * Gets the private notes.
	 *
	 * @return the private notes
	 */
	public String getPrivateNotes() {
		return privateNotes;
	}

	/**
	 * Sets the private notes.
	 *
	 * @param privateNotes the new private notes
	 */
	public void setPrivateNotes(String privateNotes) {
		this.privateNotes = privateNotes;
	}

	/**
	 * Gets the read count.
	 *
	 * @return the read count
	 */
	public String getReadCount() {
		return readCount;
	}

	/**
	 * Sets the read count.
	 *
	 * @param readCount the new read count
	 */
	public void setReadCount(String readCount) {
		this.readCount = readCount;
	}

	/**
	 * Gets the recommended for.
	 *
	 * @return the recommended for
	 */
	public String getRecommendedFor() {
		return recommendedFor;
	}

	/**
	 * Sets the recommended for.
	 *
	 * @param recommendedFor the new recommended for
	 */
	public void setRecommendedFor(String recommendedFor) {
		this.recommendedFor = recommendedFor;
	}

	/**
	 * Gets the recommended by.
	 *
	 * @return the recommended by
	 */
	public String getRecommendedBy() {
		return recommendedBy;
	}

	/**
	 * Sets the recommended by.
	 *
	 * @param recommendedBy the new recommended by
	 */
	public void setRecommendedBy(String recommendedBy) {
		this.recommendedBy = recommendedBy;
	}

	/**
	 * Gets the owned copies.
	 *
	 * @return the owned copies
	 */
	public String getOwnedCopies() {
		return ownedCopies;
	}

	/**
	 * Sets the owned copies.
	 *
	 * @param ownedCopies the new owned copies
	 */
	public void setOwnedCopies(String ownedCopies) {
		this.ownedCopies = ownedCopies;
	}

	/**
	 * Gets the original purchase date.
	 *
	 * @return the original purchase date
	 */
	public String getOriginalPurchaseDate() {
		return originalPurchaseDate;
	}

	/**
	 * Sets the original purchase date.
	 *
	 * @param originalPurchaseDate the new original purchase date
	 */
	public void setOriginalPurchaseDate(String originalPurchaseDate) {
		this.originalPurchaseDate = originalPurchaseDate;
	}

	/**
	 * Gets the original purchase location.
	 *
	 * @return the original purchase location
	 */
	public String getOriginalPurchaseLocation() {
		return originalPurchaseLocation;
	}

	/**
	 * Sets the original purchase location.
	 *
	 * @param originalPurchaseLocation the new original purchase location
	 */
	public void setOriginalPurchaseLocation(String originalPurchaseLocation) {
		this.originalPurchaseLocation = originalPurchaseLocation;
	}

	/**
	 * Gets the condition.
	 *
	 * @return the condition
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * Sets the condition.
	 *
	 * @param condition the new condition
	 */
	public void setCondition(String condition) {
		this.condition = condition;
	}

	/**
	 * Gets the condition description.
	 *
	 * @return the condition description
	 */
	public String getConditionDescription() {
		return conditionDescription;
	}

	/**
	 * Sets the condition description.
	 *
	 * @param conditionDescription the new condition description
	 */
	public void setConditionDescription(String conditionDescription) {
		this.conditionDescription = conditionDescription;
	}

	/**
	 * Gets the bcid.
	 *
	 * @return the bcid
	 */
	public String getBcid() {
		return bcid;
	}

	/**
	 * Sets the bcid.
	 *
	 * @param bcid the new bcid
	 */
	public void setBcid(String bcid) {
		this.bcid = bcid;
	}
	
	
}
