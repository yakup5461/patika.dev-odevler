import java.util.Date;

public class Book {
	
	String BookName;
	String AuthorName;
	int PageNum;
	Date ReleaseDate;
	
	public Book(String bookName, int pageNum, String authorName, Date releaseDate) {
		super();
		BookName = bookName;
		PageNum = pageNum;
		AuthorName = authorName;
		ReleaseDate = releaseDate;
	}
	
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getAuthorName() {
		return AuthorName;
	}
	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}
	public int getPageNum() {
		return PageNum;
	}
	public void setPageNum(int pageNum) {
		PageNum = pageNum;
	}
	public Date getReleaseDate() {
		return ReleaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		ReleaseDate = releaseDate;
	}
	
}
