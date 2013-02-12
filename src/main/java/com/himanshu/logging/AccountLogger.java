/*
 * Copyright 2013 Himanshu Bhardwaj
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
*/

package com.himanshu.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

public class AccountLogger implements Logger {

	private Logger logger;
	private Marker marker;

	public AccountLogger(Class clazz) {
		logger = LoggerFactory.getLogger(clazz);
	}

	public AccountLogger(String name) {
		logger = LoggerFactory.getLogger(name);
	}

	public AccountLogger (Class clazz, String accountId) {
		this(clazz);
		marker = MarkerFactory.getMarker(accountId);
	}

	public AccountLogger(String name, String accountId) {
		this(name);
		marker = MarkerFactory.getMarker(accountId);
	}

	private AccountLogger() {

	}

	public void debug(String arg0) {
		logger.debug(marker, arg0);
	}

	@Override
	public void debug(String arg0, Object arg1) {
		logger.debug(marker, arg0, arg1);

	}

	@Override
	public void debug(String arg0, Object[] arg1) {
		logger.debug(marker, arg0, arg1);

	}

	@Override
	public void debug(String arg0, Throwable arg1) {
		logger.debug(marker, arg0, arg1);

	}

	@Override
	public void debug(Marker arg0, String arg1) {
		logger.debug(marker, arg1);

	}

	@Override
	public void debug(String arg0, Object arg1, Object arg2) {
		logger.debug(marker, arg0, arg1, arg2);

	}

	@Override
	public void debug(Marker arg0, String arg1, Object arg2) {
		logger.debug(marker, arg1, arg2);

	}

	@Override
	public void debug(Marker arg0, String arg1, Object[] arg2) {
		logger.debug(marker, arg1, arg2);

	}

	@Override
	public void debug(Marker arg0, String arg1, Throwable arg2) {
		logger.debug(marker, arg1, arg2);

	}

	@Override
	public void debug(Marker arg0, String arg1, Object arg2, Object arg3) {
		logger.debug(marker, arg1, arg2, arg3);
	}

	@Override
	public void error(String arg0) {
		logger.error(marker, arg0);

	}

	@Override
	public void error(String arg0, Object arg1) {
		logger.error(marker, arg0, arg1);

	}

	@Override
	public void error(String arg0, Object[] arg1) {
		logger.error(marker, arg0, arg1);

	}

	@Override
	public void error(String arg0, Throwable arg1) {
		logger.error(marker, arg0, arg1);

	}

	@Override
	public void error(Marker arg0, String arg1) {
		logger.error(marker, arg1);

	}

	@Override
	public void error(String arg0, Object arg1, Object arg2) {
		logger.error(marker, arg0, arg1, arg2);

	}

	@Override
	public void error(Marker arg0, String arg1, Object arg2) {
		logger.error(marker, arg1, arg2);

	}

	@Override
	public void error(Marker arg0, String arg1, Object[] arg2) {
		logger.error(marker, arg1, arg2);

	}

	@Override
	public void error(Marker arg0, String arg1, Throwable arg2) {
		logger.error(marker, arg1, arg2);

	}

	@Override
	public void error(Marker arg0, String arg1, Object arg2, Object arg3) {
		logger.error(marker, arg1, arg2, arg3);

	}

	@Override
	public String getName() {
		return logger.getName();
	}

	@Override
	public void info(String arg0) {
		logger.info(marker, arg0);
	}

	@Override
	public void info(String arg0, Object arg1) {
		logger.info(marker, arg0, arg1);

	}

	@Override
	public void info(String arg0, Object[] arg1) {
		logger.info(marker, arg0, arg1);

	}

	@Override
	public void info(String arg0, Throwable arg1) {
		logger.info(marker, arg0, arg1);

	}

	@Override
	public void info(Marker arg0, String arg1) {
		logger.info(marker, arg1);

	}

	@Override
	public void info(String arg0, Object arg1, Object arg2) {
		logger.info(marker, arg0, arg1, arg2);

	}

	@Override
	public void info(Marker arg0, String arg1, Object arg2) {
		logger.info(marker, arg1, arg2);

	}

	@Override
	public void info(Marker arg0, String arg1, Object[] arg2) {
		logger.info(marker, arg1, arg2);

	}

	@Override
	public void info(Marker arg0, String arg1, Throwable arg2) {
		logger.info(marker, arg1, arg2);

	}

	@Override
	public void info(Marker arg0, String arg1, Object arg2, Object arg3) {
		logger.info(marker, arg1, arg2, arg3);

	}

	@Override
	public boolean isDebugEnabled() {
		return logger.isDebugEnabled(marker);
	}

	@Override
	public boolean isDebugEnabled(Marker arg0) {
		return isDebugEnabled(marker);
	}

	@Override
	public boolean isErrorEnabled() {
		return isErrorEnabled(marker);
	}

	@Override
	public boolean isErrorEnabled(Marker arg0) {
		return isErrorEnabled(marker);
	}

	@Override
	public boolean isInfoEnabled() {
		return isInfoEnabled(marker);
	}

	@Override
	public boolean isInfoEnabled(Marker arg0) {
		return isInfoEnabled(marker);
	}

	@Override
	public boolean isTraceEnabled() {
		return isTraceEnabled(marker);
	}

	@Override
	public boolean isTraceEnabled(Marker arg0) {
		return isTraceEnabled(marker);
	}

	@Override
	public boolean isWarnEnabled() {
		return isWarnEnabled(marker);
	}

	@Override
	public boolean isWarnEnabled(Marker arg0) {
		return isWarnEnabled(marker);
	}

	@Override
	public void trace(String arg0) {
		logger.trace(marker, arg0);

	}

	@Override
	public void trace(String arg0, Object arg1) {
		logger.trace(marker, arg0, arg1);

	}

	@Override
	public void trace(String arg0, Object[] arg1) {
		logger.trace(marker, arg0, arg1);

	}

	@Override
	public void trace(String arg0, Throwable arg1) {
		logger.trace(marker, arg0, arg1);

	}

	@Override
	public void trace(Marker arg0, String arg1) {
		logger.trace(marker, arg1);

	}

	@Override
	public void trace(String arg0, Object arg1, Object arg2) {
		logger.trace(marker, arg0, arg1, arg2);

	}

	@Override
	public void trace(Marker arg0, String arg1, Object arg2) {
		logger.trace(marker, arg1, arg2);

	}

	@Override
	public void trace(Marker arg0, String arg1, Object[] arg2) {
		logger.trace(marker, arg1, arg2);

	}

	@Override
	public void trace(Marker arg0, String arg1, Throwable arg2) {
		logger.trace(marker, arg1, arg2);

	}

	@Override
	public void trace(Marker arg0, String arg1, Object arg2, Object arg3) {
		logger.trace(marker, arg1, arg2, arg3);

	}

	@Override
	public void warn(String arg0) {
		logger.warn(marker, arg0);

	}

	@Override
	public void warn(String arg0, Object arg1) {
		logger.warn(marker, arg0, arg1);

	}

	@Override
	public void warn(String arg0, Object[] arg1) {
		logger.warn(marker, arg0, arg1);

	}

	@Override
	public void warn(String arg0, Throwable arg1) {
		logger.warn(marker, arg0, arg1);

	}

	@Override
	public void warn(Marker arg0, String arg1) {
		logger.warn(marker, arg1);

	}

	@Override
	public void warn(String arg0, Object arg1, Object arg2) {
		logger.warn(marker, arg0, arg1, arg2);

	}

	@Override
	public void warn(Marker arg0, String arg1, Object arg2) {
		logger.warn(marker, arg1, arg2);

	}

	@Override
	public void warn(Marker arg0, String arg1, Object[] arg2) {
		logger.warn(marker, arg1, arg2);

	}

	@Override
	public void warn(Marker arg0, String arg1, Throwable arg2) {
		logger.warn(marker, arg1, arg2);

	}

	@Override
	public void warn(Marker arg0, String arg1, Object arg2, Object arg3) {
		logger.warn(marker, arg1, arg2, arg3);

	}

}
