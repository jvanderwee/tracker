package com.jvanderwee.tracker

class TrackerExtension {
    def enabled = true

    def setEnabled(boolean enabled) {
        this.enabled = enabled
    }

    def getEnabled() {
        return enabled;
    }
}