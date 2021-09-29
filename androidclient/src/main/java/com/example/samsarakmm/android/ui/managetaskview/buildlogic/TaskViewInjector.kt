package com.example.samsarakmm.android.ui.managetaskview.buildlogic

import com.example.samsarakmm.android.StorageServiceLocator
import com.example.samsarakmm.android.ui.managetaskview.TaskActivity
import com.example.samsarakmm.ui.managetaskview.TaskViewEvent
import com.example.samsarakmm.ui.managetaskview.TaskViewLogic
import com.example.samsarakmm.ui.managetaskview.TaskViewModel
import com.example.samsarakmm.common.BaseViewLogic
import com.example.samsarakmm.common.DispatcherProvider

internal fun TaskActivity.buildLogic(
    vm: TaskViewModel,
    locator: StorageServiceLocator,
): BaseViewLogic<TaskViewEvent> {


    return TaskViewLogic(
        this,
        vm,
        locator.storage,
        DispatcherProvider()
    )
}