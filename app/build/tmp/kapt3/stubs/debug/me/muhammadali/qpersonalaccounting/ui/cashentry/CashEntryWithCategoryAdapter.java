package me.muhammadali.qpersonalaccounting.ui.cashentry;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0017\u0018\u0019B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016R(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lme/muhammadali/qpersonalaccounting/ui/cashentry/CashEntryWithCategoryAdapter;", "Landroidx/paging/PagedListAdapter;", "Lme/muhammadali/qpersonalaccounting/vo/GroupingVO;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "()V", "onItemClickListener", "Lkotlin/Function1;", "Lme/muhammadali/qpersonalaccounting/vo/CashEntryWithCategoryVO;", "", "getOnItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "getItemAt", "position", "", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CashEntryHeaderViewHolder", "CashEntryWithCategoryViewHolder", "Companion", "app_debug"})
public final class CashEntryWithCategoryAdapter extends androidx.paging.PagedListAdapter<me.muhammadali.qpersonalaccounting.vo.GroupingVO, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super me.muhammadali.qpersonalaccounting.vo.CashEntryWithCategoryVO, kotlin.Unit> onItemClickListener;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<me.muhammadali.qpersonalaccounting.vo.GroupingVO> diffUtil = null;
    public static final me.muhammadali.qpersonalaccounting.ui.cashentry.CashEntryWithCategoryAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<me.muhammadali.qpersonalaccounting.vo.CashEntryWithCategoryVO, kotlin.Unit> getOnItemClickListener() {
        return null;
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super me.muhammadali.qpersonalaccounting.vo.CashEntryWithCategoryVO, kotlin.Unit> p0) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final me.muhammadali.qpersonalaccounting.vo.GroupingVO getItemAt(int position) {
        return null;
    }
    
    public CashEntryWithCategoryAdapter() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lme/muhammadali/qpersonalaccounting/ui/cashentry/CashEntryWithCategoryAdapter$CashEntryHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Landroidx/databinding/ViewDataBinding;", "(Lme/muhammadali/qpersonalaccounting/ui/cashentry/CashEntryWithCategoryAdapter;Landroidx/databinding/ViewDataBinding;)V", "bind", "", "title", "", "app_debug"})
    public final class CashEntryHeaderViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final androidx.databinding.ViewDataBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        java.lang.String title) {
        }
        
        public CashEntryHeaderViewHolder(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ViewDataBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lme/muhammadali/qpersonalaccounting/ui/cashentry/CashEntryWithCategoryAdapter$CashEntryWithCategoryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Landroidx/databinding/ViewDataBinding;", "(Lme/muhammadali/qpersonalaccounting/ui/cashentry/CashEntryWithCategoryAdapter;Landroidx/databinding/ViewDataBinding;)V", "bind", "", "vo", "Lme/muhammadali/qpersonalaccounting/vo/CashEntryWithCategoryVO;", "app_debug"})
    public final class CashEntryWithCategoryViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final androidx.databinding.ViewDataBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        me.muhammadali.qpersonalaccounting.vo.CashEntryWithCategoryVO vo) {
        }
        
        public CashEntryWithCategoryViewHolder(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ViewDataBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lme/muhammadali/qpersonalaccounting/ui/cashentry/CashEntryWithCategoryAdapter$Companion;", "", "()V", "diffUtil", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lme/muhammadali/qpersonalaccounting/vo/GroupingVO;", "getDiffUtil", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<me.muhammadali.qpersonalaccounting.vo.GroupingVO> getDiffUtil() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}