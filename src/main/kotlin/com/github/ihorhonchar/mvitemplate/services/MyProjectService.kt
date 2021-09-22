package com.github.ihorhonchar.mvitemplate.services

import com.intellij.openapi.project.Project
import com.github.ihorhonchar.mvitemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
