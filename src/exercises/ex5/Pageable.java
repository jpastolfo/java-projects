package exercises.ex5;

public interface Pageable<T> {
    Page<T> getPage(int pageNumber);

    int getTotalPages();

    int getTotalElements();

    int getMaxElementsPerPage();
}