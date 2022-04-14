package com.github.ohmygodvt95.googleitplugin.services

import com.intellij.openapi.project.Project
import com.github.ohmygodvt95.googleitplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
