package com.github.wangliuliucc.ideaplugin.services

import com.intellij.openapi.project.Project
import com.github.wangliuliucc.ideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
