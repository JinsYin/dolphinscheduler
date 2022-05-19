/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.dolphinscheduler.remote.command;

import org.apache.dolphinscheduler.common.utils.JSONUtils;

import java.io.Serializable;
import java.util.Date;

/**
 * task execute running command
 * from worker to master
 */
public class TaskExecuteRunningCommand implements Serializable {

    /**
     * taskInstanceId
     */
    private int taskInstanceId;

    /**
     * process instance id
     */
    private int processInstanceId;

    /**
     * startTime
     */
    private Date startTime;

    /**
     * host
     */
    private String host;

    /**
     * status
     */
    private int status;

    /**
     * logPath
     */
    private String logPath;

    /**
     * executePath
     */
    private String executePath;

    /**
     * processId
     */
    private int processId;

    /**
     * appIds
     */
    private String appIds;

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getTaskInstanceId() {
        return taskInstanceId;
    }

    public void setTaskInstanceId(int taskInstanceId) {
        this.taskInstanceId = taskInstanceId;
    }

    public int getProcessInstanceId() {
        return processInstanceId;
    }

    public void setProcessInstanceId(int processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    public String getLogPath() {
        return logPath;
    }

    public void setLogPath(String logPath) {
        this.logPath = logPath;
    }

    public String getExecutePath() {
        return executePath;
    }

    public void setExecutePath(String executePath) {
        this.executePath = executePath;
    }

    public int getProcessId() {
        return processId;
    }

    public void setProcessId(int processId) {
        this.processId = processId;
    }

    public String getAppIds() {
        return appIds;
    }

    public void setAppIds(String appIds) {
        this.appIds = appIds;
    }

    /**
     * package request command
     *
     * @return command
     */
    public Command convert2Command() {
        Command command = new Command();
        command.setType(CommandType.TASK_EXECUTE_RUNNING);
        byte[] body = JSONUtils.toJsonByteArray(this);
        command.setBody(body);
        return command;
    }

    @Override
    public String toString() {
        return "TaskExecuteRunningCommand{"
                + "taskInstanceId=" + taskInstanceId
                + ", processInstanceId='" + processInstanceId + '\''
                + ", startTime=" + startTime
                + ", host='" + host + '\''
                + ", status=" + status
                + ", logPath='" + logPath + '\''
                + ", executePath='" + executePath + '\''
                + ", processId=" + processId + '\''
                + ", appIds='" + appIds + '\''
                + '}';
    }
}
