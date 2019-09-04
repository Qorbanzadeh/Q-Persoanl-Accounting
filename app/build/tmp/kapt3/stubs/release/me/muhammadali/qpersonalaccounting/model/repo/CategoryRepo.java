package me.muhammadali.qpersonalaccounting.model.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\u0006\u0010\u0014\u001a\u00020\bJ\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lme/muhammadali/qpersonalaccounting/model/repo/CategoryRepo;", "", "dao", "Lme/muhammadali/qpersonalaccounting/model/dao/CategoryDao;", "(Lme/muhammadali/qpersonalaccounting/model/dao/CategoryDao;)V", "delete", "Lio/reactivex/Completable;", "categoryId", "", "category", "Lme/muhammadali/qpersonalaccounting/model/entity/Category;", "getCategoriesByType", "Lio/reactivex/Flowable;", "", "type", "Lme/muhammadali/qpersonalaccounting/model/entity/Category$Type;", "getCategoriesWithAmountByType", "Lme/muhammadali/qpersonalaccounting/vo/CategoryWithAmountVO;", "getCategory", "Lio/reactivex/Single;", "id", "save", "app_release"})
public final class CategoryRepo {
    private final me.muhammadali.qpersonalaccounting.model.dao.CategoryDao dao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<me.muhammadali.qpersonalaccounting.model.entity.Category> getCategory(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.util.List<me.muhammadali.qpersonalaccounting.model.entity.Category>> getCategoriesByType(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.Category.Type type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.util.List<me.muhammadali.qpersonalaccounting.vo.CategoryWithAmountVO>> getCategoriesWithAmountByType(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.Category.Type type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable save(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.Category category) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable delete(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.Category category) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable delete(int categoryId) {
        return null;
    }
    
    public CategoryRepo(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.dao.CategoryDao dao) {
        super();
    }
}