package com.risk.engine.annotation;

/**
 * 计算单元接口
 * @author JayZee 文
 *
 */
public interface CellComputeService<T,R> {

	R compute(T t);
}
