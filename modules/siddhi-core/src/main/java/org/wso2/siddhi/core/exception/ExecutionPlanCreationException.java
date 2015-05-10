/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.siddhi.core.exception;

public class ExecutionPlanCreationException extends RuntimeException {
    boolean classLoadingIssue = false;

    public ExecutionPlanCreationException() {
        super();
    }

    public ExecutionPlanCreationException(String message) {
        super(message);
    }

    public ExecutionPlanCreationException(String message, boolean isClassLoadingIssue) {
        super(message);
        classLoadingIssue = isClassLoadingIssue;
    }

    public ExecutionPlanCreationException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public ExecutionPlanCreationException(Throwable throwable) {
        super(throwable);
    }

    public ExecutionPlanCreationException(String message, Throwable throwable, boolean isClassLoadingIssue) {
        super(message, throwable);
        classLoadingIssue = isClassLoadingIssue;
    }

    public boolean isClassLoadingIssue() {
        return classLoadingIssue;
    }
}
