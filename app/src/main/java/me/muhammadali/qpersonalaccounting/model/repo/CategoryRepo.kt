package me.muhammadali.qpersonalaccounting.model.repo

import me.muhammadali.qpersonalaccounting.model.dao.CategoryDao
import me.muhammadali.qpersonalaccounting.model.entity.Category
import io.reactivex.Completable

class CategoryRepo(private val dao: CategoryDao) {

    fun getCategory(id: Int) = dao.getCategory(id)

    fun getCategoriesByType(type: Category.Type) = dao.findCategoriesByType(type)

    fun getCategoriesWithAmountByType(type: Category.Type) = dao.findCategoriesWithAmountByType(type)

    fun save(category: Category): Completable {
        val id = category.id

        if (id > 0) {
            return dao.updateAsync(category)
        }

        return dao.insertAsync(category)
    }

    fun delete(category: Category): Completable {
        return dao.deleteAsync(category)
    }

    fun delete(categoryId: Int): Completable {
        return Completable.create {
            try {
                dao.delete(dao.getCategorySync(categoryId))
                it.onComplete()
            } catch (e: Exception) {
                it.onError(e)
            }
        }
    }

}