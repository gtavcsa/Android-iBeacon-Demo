package com.radiusnetworks.ibeaconreference.service;

import com.radiusnetworks.ibeaconreference.beacons.BeaconScanner;

/**
 * Created by Sergio Martinez Rodriguez
 * Date 25/1/16.
 */
public class BackgroundTasksManagerImpl implements BackgroundTasksManager {

  private BeaconScanner beaconScanner;

  public BackgroundTasksManagerImpl(BeaconScanner beaconScanner) {
    this.beaconScanner = beaconScanner;
  }

  @Override public void startBackgroundTasks() {
    beaconScanner.initMonitoring();
  }

  @Override public void finalizeBackgroundTasks() {
    //beaconScanner.stopMonitoring();
    beaconScanner.switchMonitoringToStandBy();
  }

}