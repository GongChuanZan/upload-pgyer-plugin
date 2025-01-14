package ren.helloworld.upload2pgyer.apiv2;

public class ParamsBeanV2 {
    private String apiKey;
    // file start
    private String scandir;
    private String wildcard;
    private String uploadFile;
    // file end
    private String buildInstallType;
    private String buildPassword;
    private String buildUpdateDescription;
    private String buildType;
    private String buildChannelShortcut;


    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getScandir() {
        return scandir;
    }

    public void setScandir(String scandir) {
        this.scandir = scandir;
    }

    public String getWildcard() {
        return wildcard;
    }

    public void setWildcard(String wildcard) {
        this.wildcard = wildcard;
    }

    public String getUploadFile() {
        return uploadFile;
    }

    public void setUploadFile(String uploadFile) {
        this.uploadFile = uploadFile;
    }

    public String getBuildInstallType() {
        return buildInstallType;
    }

    public void setBuildInstallType(String buildInstallType) {
        this.buildInstallType = buildInstallType;
    }

    public String getBuildPassword() {
        return buildPassword;
    }

    public void setBuildPassword(String buildPassword) {
        this.buildPassword = buildPassword;
    }

    public String getBuildType() {
        return buildType;
    }

    public void setBuildType(String buildType) {
        this.buildType = buildType;
    }

    public String getBuildUpdateDescription() {
        return buildUpdateDescription;
    }

    public void setBuildUpdateDescription(String buildUpdateDescription) {
        this.buildUpdateDescription = buildUpdateDescription;
    }

    public String getBuildChannelShortcut() {
        return buildChannelShortcut;
    }

    public void setBuildChannelShortcut(String buildChannelShortcut) {
        this.buildChannelShortcut = buildChannelShortcut;
    }

}
