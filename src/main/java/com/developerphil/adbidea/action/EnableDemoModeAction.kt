package com.developerphil.adbidea.action

import com.developerphil.adbidea.adb.AdbFacade
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.Project

class EnableDemoModeAction : AdbAction() {
    override fun actionPerformed(e: AnActionEvent, project: Project) {
        AdbFacade.enableDemoModeAction(project)
    }
}