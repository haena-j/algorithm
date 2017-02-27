//1.¸ðµ¨¸µ
package algorithm;
public class BookVO {
	private String title;
	private int price;
	private String author;
	private int rank;
	
	public BookVO(String title, int price, String author, int rank) {
		super();
		this.title = title;
		this.price = price;
		this.author = author;
		this.rank = rank;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
}
