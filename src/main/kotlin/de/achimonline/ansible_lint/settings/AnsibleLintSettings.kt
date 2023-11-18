package de.achimonline.ansible_lint.settings

data class AnsibleLintSettings(
    var path: String = "",
    var executable: String = "ansible-lint",
    var offline: Boolean = false,
    var onlyRunWhenConfigFilePresent: Boolean = true,
    var visualizeIgnoredRules: Boolean = true
)
