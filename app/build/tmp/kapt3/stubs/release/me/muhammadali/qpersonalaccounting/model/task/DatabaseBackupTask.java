package me.muhammadali.qpersonalaccounting.model.task;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0007J%\u0010\b\u001a\u00020\u00052\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\n\"\u0004\u0018\u00010\u0002H\u0015\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002\u00a8\u0006\u0010"}, d2 = {"Lme/muhammadali/qpersonalaccounting/model/task/DatabaseBackupTask;", "Lme/muhammadali/qpersonalaccounting/model/task/AbstractTask;", "Ljava/io/File;", "completion", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "doInBackground", "params", "", "([Ljava/io/File;)Ljava/lang/Boolean;", "writeFileToZip", "zipOut", "Ljava/util/zip/ZipOutputStream;", "file", "app_release"})
public final class DatabaseBackupTask extends me.muhammadali.qpersonalaccounting.model.task.AbstractTask<java.io.File> {
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SdCardPath"})
    @java.lang.Override()
    protected java.lang.Boolean doInBackground(@org.jetbrains.annotations.NotNull()
    java.io.File... params) {
        return null;
    }
    
    private final void writeFileToZip(java.util.zip.ZipOutputStream zipOut, java.io.File file) {
    }
    
    public DatabaseBackupTask(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> completion) {
        super(null);
    }
}