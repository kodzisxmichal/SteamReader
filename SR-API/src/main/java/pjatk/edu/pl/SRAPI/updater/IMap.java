package pjatk.edu.pl.SRAPI.updater;

public interface IMap<TDTO, TEntity>{

    TEntity map(TDTO dto);
}
