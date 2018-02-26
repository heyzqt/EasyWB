package com.heyzqt.easywb.data.local.dao;

import java.util.List;

/**
 * Created by heyzqt on 2018/2/23.
 *
 * Data Access Object for the specified table.
 */

public interface WeiboDao<T> {

	/**
	 * Select all tasks from the tasks table.
	 *
	 * @return all tasks.
	 */
	List<T> getTasks();

	/**
	 * Select a task by ID.
	 *
	 * @param id the task id.
	 * @return the task with id.
	 */
	T getTaskById(String id);

	/**
	 * Insert a task.
	 * If the task already exists,replace it.
	 *
	 * @return If insert succeed return true or false.
	 */
	boolean insertTask(T task);

	/**
	 * Update a task.
	 *
	 * @param task task to be updated
	 * @return the number of tasks updated.This should always be 1.
	 */
	int updateTask(T task);

	/**
	 * Delete a task by ID.
	 *
	 * @param id the task id.
	 * @return the number of tasks are deleted.This should always be 1.
	 */
	int deleteTaskById(String id);

	/**
	 * Delete all tasks
	 *
	 * @return the number of tasks are deleted.
	 */
	int deleteAllTasks();
}
