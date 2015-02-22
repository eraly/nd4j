/*
 * Copyright 2015 Skymind,Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.nd4j.linalg.ops.reduceops.scalarops;

import com.google.common.base.Function;
import org.nd4j.linalg.api.ndarray.INDArray;

/**
 * A scalar op over an ndarray (iterates through the whole ndarray for an aggregate result)
 *
 * @author Adam Gibson
 */
public interface ScalarOp extends Function<INDArray, Double> {
}