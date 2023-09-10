package exercises.ex5;

import java.util.ArrayList;
import java.util.List;

public class PageableList<T> implements Pageable<T> {

    private List<T> elementos;
    private int numeroDeElementosPorPagina;
    private int totalPagesNumber;

    public PageableList(List<T> elementos, int numeroDeElementosPorPagina) {
        this.elementos = elementos;
        this.numeroDeElementosPorPagina = numeroDeElementosPorPagina;
        this.totalPagesNumber = calculaTotalDePaginas();
    }

    private int calculaTotalDePaginas() {
        if (getTotalElements() == 0) return 1;

        double total = getTotalElements();
        double maxPerPage = getMaxElementsPerPage();
        return (int)Math.round(total/maxPerPage);
    }

    @Override
    public Page<T> getPage(int pageNumber) {
        if (pageNumber >= getTotalPages()) {
            throw new PageOutOfBounds(pageNumber, getMaxIndex());
        }
        int indiceInferior = pageNumber * getMaxElementsPerPage();
        int indiceSuperior = indiceInferior + getMaxElementsPerPage();
        if (indiceSuperior > getTotalElements()) {
            indiceSuperior = getTotalElements();
        }
        List<T> elementosDaPagina = elementos.subList(indiceInferior,indiceSuperior);
        return new Page<>(pageNumber,elementosDaPagina,isLastPage(pageNumber));
    }

    @Override
    public int getTotalPages() {
        return totalPagesNumber;
    };

    @Override
    public int getTotalElements() {
        return elementos.size();
    }

    @Override
    public int getMaxElementsPerPage() {
        return numeroDeElementosPorPagina;
    }

    private int getMaxIndex() {
        return getTotalPages() - 1;
    }

    private boolean isLastPage(int pageNumber) {
        return pageNumber == getMaxIndex();
    }

    @Override
    public String toString() {
        return "PageableList{" +
                "elementos=" + elementos +
                ", numeroDeElementosPorPagina=" + numeroDeElementosPorPagina +
                ", totalPagesNumber=" + totalPagesNumber +
                "}";
    }
}
