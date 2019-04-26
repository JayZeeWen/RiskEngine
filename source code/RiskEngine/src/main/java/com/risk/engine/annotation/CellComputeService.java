package com.risk.engine.annotation;

/**
 * 计算单元接口
 * @author Peter 马克
 *
 */
public interface CellComputeService<T,R> {

	R compute(T t);
}
