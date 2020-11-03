package org.kbinani.cadencii.function_interfaces;

/**
 * デフォルトではFunctionに3引数は渡せないため
 * @param <T> 1番目の引数の型
 * @param <U> 2番目の引数の型
 * @param <V> 3番目の引数の型
 * @param <R> 戻り値の型
 */
@FunctionalInterface
public interface TriFunction<T,U,V,R> {
    R apply(T t,U u,V v);
}
