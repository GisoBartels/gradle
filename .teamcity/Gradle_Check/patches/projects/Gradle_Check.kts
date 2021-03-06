package Gradle_Check.patches.projects

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import jetbrains.buildServer.configs.kotlin.v2019_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the project with uuid = 'Gradle_Check' (id = 'Gradle_Check')
accordingly, and delete the patch script.
*/
changeProject(uuid("Gradle_Check")) {
    params {
        expect {
            param("env.GRADLE_ENTERPRISE_ACCESS_KEY", "%ge.gradle.org.access.key%")
        }
        update {
            param("env.GRADLE_ENTERPRISE_ACCESS_KEY", "credentialsJSON:38dd3489-7119-4d37-ad63-3de52d8f613b")
        }
    }
}
