package com.mj.assignment;

abstract class Item {
    private int id;
    private String title;
    private int numberOfCopies;

    public Item(int id, String title, int numberOfCopies) {
        this.id = id;
        this.title = title;
        this.numberOfCopies = numberOfCopies;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public void checkIn() {
        numberOfCopies++;
    }

    public void checkOut() {
        if (numberOfCopies > 0) {
            numberOfCopies--;
        } else {
            System.out.println("No copies available for checkout.");
        }
    }

    public void addItem(int copies) {
        numberOfCopies += copies;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        return id == item.id;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Copies: " + numberOfCopies;
    }

    public abstract void print();
}

abstract class WrittenItem extends Item {
    private String author;

    public WrittenItem(int id, String title, int numberOfCopies, String author) {
        super(id, title, numberOfCopies);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString() + ", Author: " + author;
    }
}
class Book extends WrittenItem {
    public Book(int id, String title, int numberOfCopies, String author) {
        super(id, title, numberOfCopies, author);
    }

    @Override
    public void print() {
        System.out.println("Book: " + toString());
    }
}

class JournalPaper extends WrittenItem {
    private int yearPublished;

    public JournalPaper(int id, String title, int numberOfCopies, String author, int yearPublished) {
        super(id, title, numberOfCopies, author);
        this.yearPublished = yearPublished;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public void print() {
        System.out.println("JournalPaper: " + toString() + ", Year Published: " + yearPublished);
    }
}

abstract class MediaItem extends Item {
    private int runtime;

    public MediaItem(int id, String title, int numberOfCopies, int runtime) {
        super(id, title, numberOfCopies);
        this.runtime = runtime;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    @Override
    public String toString() {
        return super.toString() + ", Runtime: " + runtime + " minutes";
    }
}

class Video extends MediaItem {
    private String director;
    private String genre;
    private int yearReleased;

    public Video(int id, String title, int numberOfCopies, int runtime, String director, String genre, int yearReleased) {
        super(id, title, numberOfCopies, runtime);
        this.director = director;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    @Override
    public void print() {
        System.out.println("Video: " + toString() + ", Director: " + director + ", Genre: " + genre + ", Year Released: " + yearReleased);
    }
}

class CD extends MediaItem {
    private String artist;
    private String genre;

    public CD(int id, String title, int numberOfCopies, int runtime, String artist, String genre) {
        super(id, title, numberOfCopies, runtime);
        this.artist = artist;
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void print() {
        System.out.println("CD: " + toString() + ", Artist: " + artist + ", Genre: " + genre);
    }
}




public class LibraryOperation {

	public static void main(String[] args) {
		Book book = new Book(1, "The Great Gatsby", 3, "F. Scott Fitzgerald");
        JournalPaper journalPaper = new JournalPaper(2, "Quantum Physics", 5, "Albert Einstein", 1925);
        Video video = new Video(3, "Inception", 2, 148, "Christopher Nolan", "Sci-Fi", 2010);
        CD cd = new CD(4, "Thriller", 4, 42, "Michael Jackson", "Pop");

        book.print();
        journalPaper.print();
        video.print();
        cd.print();

        book.checkOut();
        journalPaper.checkIn();
        video.addItem(1);
        cd.checkOut();

        book.print();
        journalPaper.print();
        video.print();
        cd.print();

	}

}
