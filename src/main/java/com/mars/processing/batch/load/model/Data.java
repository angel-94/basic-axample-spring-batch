package com.mars.processing.batch.load.model;

/**
 * @author Manuel Angel Ruiz Sumano - [Meltsan-Team]
 * @version 1.0.0
 * Data:
 * @since 2019-01-30
 */
public class Data {

    private String cveData;
    private String dsData;

    public Data() {
    }

    public Data(String cveData, String dsData) {
        this.cveData = cveData;
        this.dsData = dsData;
    }

    public String getCveData() {
        return cveData;
    }

    public void setCveData(String cveData) {
        this.cveData = cveData;
    }

    public String getDsData() {
        return dsData;
    }

    public void setDsData(String dsData) {
        this.dsData = dsData;
    }
}
