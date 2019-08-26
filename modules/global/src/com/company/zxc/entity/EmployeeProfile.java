package com.company.zxc.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|firstName")
@Table(name = "ZXC_EMPLOYEE_PROFILE")
@Entity(name = "zxc$EmployeeProfile")
public class EmployeeProfile extends StandardEntity {
    private static final long serialVersionUID = 8769073788018216456L;

    @NotNull
    @Column(name = "USERNAME", nullable = false)
    protected String username;

    @NotNull
    @Column(name = "NICKNAME", nullable = false)
    protected String nickname;

    @Column(name = "FIRST_NAME")
    protected String firstName;

    @Column(name = "LAST_NAME")
    protected String lastName;

    @Column(name = "DISPLAY_NAME")
    protected String displayName;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AVATAR_ID")
    protected FileDescriptor avatar;

    @Column(name = "BIOGRAPHICAL_INFO", length = 1023)
    protected String biographicalInfo;

    @Column(name = "WEBSITE")
    protected String website;

    @Column(name = "EMAIL")
    protected String email;

    @NotNull
    @Lob
    @Column(name = "HASH_PASSWORD", nullable = false)
    protected String hashPassword;

    @Column(name = "IS_HR_MANAGER")
    protected Boolean isHRManager;

    @Column(name = "IS_RECRUITER")
    protected Boolean isRecruiter;

    @Column(name = "IS_CRM_MANAGER")
    protected Boolean isCRMManager = false;

    @Column(name = "IS_CRM_AGENT")
    protected Boolean isCRMAgent;

    @Column(name = "IS_ACCOUNTING_MANAGER")
    protected Boolean isAccountingManager;

    @Column(name = "IS_CHOOSING_NOTIFICATIONS")
    protected Boolean isChoosingNotifications;

    @Column(name = "IS_CHOOSING_VISUAL_EDITOR")
    protected Boolean isChoosingVisualEditor;

    @Column(name = "IS_CHOOSING_SYNTAX_HIGHLIGHTING")
    protected Boolean isChoosingSyntaxHighlighting;

    @Column(name = "ADMIN_COLOR_SCHEME")
    protected String adminColorScheme;

    @Column(name = "IS_CHOOSING_KEYBOARD_STRUCTS")
    protected Boolean isChoosingKeyboardStructs;

    @Column(name = "IS_CHOOSING_TOOLBAR")
    protected Boolean isChoosingToolbar;

    public FileDescriptor getAvatar() {
        return avatar;
    }

    public void setAvatar(FileDescriptor avatar) {
        this.avatar = avatar;
    }

    public Boolean getIsChoosingToolbar() {
        return isChoosingToolbar;
    }

    public void setIsChoosingToolbar(Boolean isChoosingToolbar) {
        this.isChoosingToolbar = isChoosingToolbar;
    }

    public Boolean getIsChoosingKeyboardStructs() {
        return isChoosingKeyboardStructs;
    }

    public void setIsChoosingKeyboardStructs(Boolean isChoosingKeyboardStructs) {
        this.isChoosingKeyboardStructs = isChoosingKeyboardStructs;
    }

    public AdminColorScheme getAdminColorScheme() {
        return adminColorScheme == null ? null : AdminColorScheme.fromId(adminColorScheme);
    }

    public void setAdminColorScheme(AdminColorScheme adminColorScheme) {
        this.adminColorScheme = adminColorScheme == null ? null : adminColorScheme.getId();
    }

    public Boolean getIsChoosingSyntaxHighlighting() {
        return isChoosingSyntaxHighlighting;
    }

    public void setIsChoosingSyntaxHighlighting(Boolean isChoosingSyntaxHighlighting) {
        this.isChoosingSyntaxHighlighting = isChoosingSyntaxHighlighting;
    }

    public Boolean getIsChoosingVisualEditor() {
        return isChoosingVisualEditor;
    }

    public void setIsChoosingVisualEditor(Boolean isChoosingVisualEditor) {
        this.isChoosingVisualEditor = isChoosingVisualEditor;
    }

    public Boolean getIsChoosingNotifications() {
        return isChoosingNotifications;
    }

    public void setIsChoosingNotifications(Boolean isChoosingNotifications) {
        this.isChoosingNotifications = isChoosingNotifications;
    }

    public Boolean getIsAccountingManager() {
        return isAccountingManager;
    }

    public void setIsAccountingManager(Boolean isAccountingManager) {
        this.isAccountingManager = isAccountingManager;
    }

    public Boolean getIsCRMAgent() {
        return isCRMAgent;
    }

    public void setIsCRMAgent(Boolean isCRMAgent) {
        this.isCRMAgent = isCRMAgent;
    }

    public Boolean getIsCRMManager() {
        return isCRMManager;
    }

    public void setIsCRMManager(Boolean isCRMManager) {
        this.isCRMManager = isCRMManager;
    }

    public Boolean getIsRecruiter() {
        return isRecruiter;
    }

    public void setIsRecruiter(Boolean isRecruiter) {
        this.isRecruiter = isRecruiter;
    }

    public Boolean getIsHRManager() {
        return isHRManager;
    }

    public void setIsHRManager(Boolean isHRManager) {
        this.isHRManager = isHRManager;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getBiographicalInfo() {
        return biographicalInfo;
    }

    public void setBiographicalInfo(String biographicalInfo) {
        this.biographicalInfo = biographicalInfo;
    }

    public DisplayName getDisplayName() {
        return displayName == null ? null : DisplayName.fromId(displayName);
    }

    public void setDisplayName(DisplayName displayName) {
        this.displayName = displayName == null ? null : displayName.getId();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}