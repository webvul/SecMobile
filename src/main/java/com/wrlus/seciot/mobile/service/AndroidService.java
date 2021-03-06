package com.wrlus.seciot.mobile.service;

import java.io.File;
import java.util.List;

import com.wrlus.seciot.mobile.model.ApkInfo;
import com.wrlus.seciot.mobile.model.MonitoringParameter;
import com.wrlus.seciot.platform.model.PlatformRiskDao;
import com.wrlus.seciot.platform.model.PlatformRiskResult;
import com.wrlus.seciot.util.exception.PythonException;

public interface AndroidService {
	public ApkInfo getApkInfo(File apkFile) throws PythonException;
	public String[] getAndroidPermissions(ApkInfo apkInfo) throws PythonException;
	public List<PlatformRiskResult> checkApkPlatformRisks(ApkInfo apkInfo, PlatformRiskDao[] platformRisks) throws PythonException;
	public String[] getProcessList(int port) throws PythonException;
	public String monitoringDevice(MonitoringParameter monitorParameter) throws PythonException;
	public String stopMonitoringDevice(int port) throws PythonException;
	public String customInjection(int port, String process, File jsFile) throws PythonException;
}
