package me.muhammadali.qpersonalaccounting.model.task;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u001b\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0014\u00a2\u0006\u0002\u0010\u000bR\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lme/muhammadali/qpersonalaccounting/model/task/AbstractTask;", "Params", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "completion", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "onPostExecute", "result", "(Ljava/lang/Boolean;)V", "app_debug"})
public abstract class AbstractTask<Params extends java.lang.Object> extends android.os.AsyncTask<Params, java.lang.Void, java.lang.Boolean> {
    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> completion = null;
    
    @java.lang.Override()
    protected void onPostExecute(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean result) {
    }
    
    public AbstractTask(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> completion) {
        super();
    }
}