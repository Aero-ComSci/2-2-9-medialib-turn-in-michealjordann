// Its your turn section of 2.2.9 says it is optional, so it is not added in here.
public class MediaLib
{
  public static String owner = "PLTW";
  
  private static int numEntries;
  private static int numBooks;
  private static int numMovies;
  private static int numSongs;
  
  private Book book;
  private Movie movie;
  private Song song;
  
  public MediaLib()
  {
  }
  
  public void addBook(Book b)
  {
    if (book == null)
    {
      book = b;
      numEntries++;
      numBooks++;
    }
    else
      System.out.println("Cant add, already has a book");
  }
  
  public void addMovie(Movie m)
  {
    if (movie == null)
    {
      movie = m;
      numEntries++;
      numMovies++;
    }
    else
      System.out.println("Cant add, already has a movie");
  }
  
  public void addSong(Song s)
  {
    if (song == null)
    {
      song = s;
      numEntries++;
      numSongs++;
    }
    else
      System.out.println("Cant add, already has a song");
  }

  public static void changeOwner(String o)
  {
    owner = o;
  }
  
  public static int getNumEntries()
  {
    System.out.println("Owner: " + owner);
    return numEntries;
  }
  
  public static int getNumBooks()
  {
    return numBooks;
  }
  
  public static int getNumMovies()
  {
    return numMovies;
  }
  
  public static int getNumSongs()
  {
    return numSongs;
  }
  
  public String toString() 
  {
    String info = "";
    
    if (book != null)
      info += "Book: " + book + "\n";
    if (movie != null)
      info += "Movie: " + movie + "\n";
    if (song != null)
      info += "Song: " + song + "\n";
 
    return info;
  }
}
