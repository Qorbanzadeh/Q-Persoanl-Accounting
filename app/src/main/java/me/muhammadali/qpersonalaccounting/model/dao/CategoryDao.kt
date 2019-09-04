package me.muhammadali.qpersonalaccounting.model.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import me.muhammadali.qpersonalaccounting.model.entity.Category
import me.muhammadali.qpersonalaccounting.vo.CategoryWithAmountVO
import io.reactivex.Flowable
import io.reactivex.Single

@Dao
abstract class CategoryDao : BaseDao<Category>, CudDao<Category> {

    @Query("SELECT * FROM CATEGORY WHERE id = :id LIMIT 1")
    abstract fun getCategory(id: Int): Single<Category>

    @Query("SELECT * FROM CATEGORY WHERE id = :id LIMIT 1")
    abstract fun getCategorySync(id: Int): Category

    @Query("SELECT * FROM CATEGORY WHERE type = :type")
    abstract fun findCategoriesByType(type: Category.Type): Flowable<List<Category>>

    @Query("SELECT c.id, c.name, c.color, SUM(e.amount) AS amount FROM CATEGORY c " +
            "LEFT JOIN CASH_ENTRY e ON c.id = e.category_id " +
            "WHERE c.type = :type " +
            "GROUP BY c.id, c.name, c.color")
    abstract fun findCategoriesWithAmountByType(type: Category.Type): Flowable<List<CategoryWithAmountVO>>

    @Transaction
    open fun saveCategory(category: Category) {
        val id = category.id

        if (id > 0) {
            update(category)
        } else {
            insert(category)
        }
    }

}