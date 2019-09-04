package me.muhammadali.qpersonalaccounting.model.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\'J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\'J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0017\u00a8\u0006\u0014"}, d2 = {"Lme/muhammadali/qpersonalaccounting/model/dao/CategoryDao;", "Lme/muhammadali/qpersonalaccounting/model/dao/BaseDao;", "Lme/muhammadali/qpersonalaccounting/model/entity/Category;", "Lme/muhammadali/qpersonalaccounting/model/dao/CudDao;", "()V", "findCategoriesByType", "Lio/reactivex/Flowable;", "", "type", "Lme/muhammadali/qpersonalaccounting/model/entity/Category$Type;", "findCategoriesWithAmountByType", "Lme/muhammadali/qpersonalaccounting/vo/CategoryWithAmountVO;", "getCategory", "Lio/reactivex/Single;", "id", "", "getCategorySync", "saveCategory", "", "category", "app_release"})
public abstract class CategoryDao implements me.muhammadali.qpersonalaccounting.model.dao.BaseDao<me.muhammadali.qpersonalaccounting.model.entity.Category>, me.muhammadali.qpersonalaccounting.model.dao.CudDao<me.muhammadali.qpersonalaccounting.model.entity.Category> {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM CATEGORY WHERE id = :id LIMIT 1")
    public abstract io.reactivex.Single<me.muhammadali.qpersonalaccounting.model.entity.Category> getCategory(int id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM CATEGORY WHERE id = :id LIMIT 1")
    public abstract me.muhammadali.qpersonalaccounting.model.entity.Category getCategorySync(int id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM CATEGORY WHERE type = :type")
    public abstract io.reactivex.Flowable<java.util.List<me.muhammadali.qpersonalaccounting.model.entity.Category>> findCategoriesByType(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.Category.Type type);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT c.id, c.name, c.color, SUM(e.amount) AS amount FROM CATEGORY c LEFT JOIN CASH_ENTRY e ON c.id = e.category_id WHERE c.type = :type GROUP BY c.id, c.name, c.color")
    public abstract io.reactivex.Flowable<java.util.List<me.muhammadali.qpersonalaccounting.vo.CategoryWithAmountVO>> findCategoriesWithAmountByType(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.Category.Type type);
    
    @androidx.room.Transaction()
    public void saveCategory(@org.jetbrains.annotations.NotNull()
    me.muhammadali.qpersonalaccounting.model.entity.Category category) {
    }
    
    public CategoryDao() {
        super();
    }
}