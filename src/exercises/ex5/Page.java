package exercises.ex5;

import java.util.List;

public class Page<T> {

    private int pageNumber;
    private List<T> elements;
    private boolean lastPage;

    public Page(int pageNumber, List<T> elements, boolean lastPage) {
        this.pageNumber = pageNumber;
        this.elements = elements;
        this.lastPage = lastPage;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public List<T> getElements() {
        return elements;
    }

    public boolean isLastPage() {
        return lastPage;
    }

    @Override
    public String toString() {
        return "Page{" +
                "elements=" + elements +
                ", pageNumber=" + pageNumber +
                ", lastPage=" + lastPage +
                "}";
    }
}
