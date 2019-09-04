package me.muhammadali.qpersonalaccounting.ui.category;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0016\u0017B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fJ\u001c\u0010\u0010\u001a\u00020\b2\n\u0010\u0011\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0012\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000fH\u0016R.\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lme/muhammadali/qpersonalaccounting/ui/category/CategoryWithAmountAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lme/muhammadali/qpersonalaccounting/vo/CategoryWithAmountVO;", "Lme/muhammadali/qpersonalaccounting/ui/category/CategoryWithAmountAdapter$CategoryWithAmountViewHolder;", "()V", "onItemClickListener", "Lkotlin/Function2;", "Landroid/view/View;", "", "getOnItemClickListener", "()Lkotlin/jvm/functions/Function2;", "setOnItemClickListener", "(Lkotlin/jvm/functions/Function2;)V", "getItemAt", "position", "", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CategoryWithAmountViewHolder", "Companion", "app_release"})
public final class CategoryWithAmountAdapter extends androidx.recyclerview.widget.ListAdapter<me.muhammadali.qpersonalaccounting.vo.CategoryWithAmountVO, me.muhammadali.qpersonalaccounting.ui.category.CategoryWithAmountAdapter.CategoryWithAmountViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function2<? super android.view.View, ? super me.muhammadali.qpersonalaccounting.vo.CategoryWithAmountVO, kotlin.Unit> onItemClickListener;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<me.muhammadali.qpersonalaccounting.vo.CategoryWithAmountVO> diffUtil = null;
    public static final me.muhammadali.qpersonalaccounting.ui.category.CategoryWithAmountAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function2<android.view.View, me.muhammadali.qpersonalaccounting.vo.CategoryWithAmountVO, kotlin.Unit> getOnItemClickListener() {
        return null;
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function2<? super android.view.View, ? super me.muhammadali.qpersonalaccounting.vo.CategoryWithAmountVO, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public me.muhammadali.qpersonalaccounting.ui.category.CategoryWithAmountAdapter.CategoryWithAmountViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.ui.category.CategoryWithAmountAdapter.CategoryWithAmountViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final me.muhammadali.qpersonalaccounting.vo.CategoryWithAmountVO getItemAt(int position) {
        return null;
    }
    
    public CategoryWithAmountAdapter() {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lme/muhammadali/qpersonalaccounting/ui/category/CategoryWithAmountAdapter$CategoryWithAmountViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Landroidx/databinding/ViewDataBinding;", "(Lme/muhammadali/qpersonalaccounting/ui/category/CategoryWithAmountAdapter;Landroidx/databinding/ViewDataBinding;)V", "bind", "", "vo", "Lme/muhammadali/qpersonalaccounting/vo/CategoryWithAmountVO;", "app_release"})
    public final class CategoryWithAmountViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final androidx.databinding.ViewDataBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        me.muhammadali.qpersonalaccounting.vo.CategoryWithAmountVO vo) {
        }
        
        public CategoryWithAmountViewHolder(@org.jetbrains.annotations.NotNull()
        androidx.databinding.ViewDataBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lme/muhammadali/qpersonalaccounting/ui/category/CategoryWithAmountAdapter$Companion;", "", "()V", "diffUtil", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lme/muhammadali/qpersonalaccounting/vo/CategoryWithAmountVO;", "getDiffUtil", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<me.muhammadali.qpersonalaccounting.vo.CategoryWithAmountVO> getDiffUtil() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}