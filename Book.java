/*
 * Activity 2.2.7
 *
 * A Book class for the MediaLibrary program
 */
public class Book
{
  private String title;
  private String author;
  private int rating;
  
  public Book(String t, String a)
  {
    title = t;
    author = a;
    rating = 0;
  }
  
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }
  
  public int getRating() {
    return rating;
  }
  
  public String toString() 
  {
    String info = "\"" + title + "\", written by " + author;
    
    if (rating != 0) 
    { 
      info += ", rating is " + rating;
    }
    
    return info;
  }

  public void setTitle(String t) {
    title = t;
  }

  public void setAuthor(String a) {
    author = a;
  }

  public void adjustRating(int r) {
    int newRating = rating + r;
    if (newRating >= 0 && newRating <= 10) {
      rating = newRating;
    }
  }

  public boolean equals(Book b) {
    return this.title.equals(b.title) && this.author.equals(b.author);
  }

  public static String getOwner(){
    return "pltw";
  }
}
