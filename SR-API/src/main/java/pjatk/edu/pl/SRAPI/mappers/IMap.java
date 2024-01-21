package pjatk.edu.pl.SRAPI.mappers;

public interface IMap<TDTO, TEntity>{

    TEntity map(TDTO dto, Long ID);
}
