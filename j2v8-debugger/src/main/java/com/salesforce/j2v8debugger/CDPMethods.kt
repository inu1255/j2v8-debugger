/*
 * Copyright (c) 2020, Salesforce.com, inc.
 * All rights reserved.
 * SPDX-License-Identifier: BSD-3-Clause
 * For full license text, see the LICENSE file in the repo root or https://opensource.org/licenses/BSD-3-Clause
 *
 */

package com.salesforce.j2v8debugger

object Protocol {
    object Debugger {
        private val domain = "Debugger"
        val BreakpointResolved = "$domain.breakpointResolved"
        val EvaluateOnCallFrame = "$domain.evaluateOnCallFrame"
        val Enable = "$domain.enable"
        val Pause = "$domain.pause"
        val Paused = "$domain.paused"
        val RemoveBreakpoint = "$domain.removeBreakpoint"
        val Resume = "$domain.resume"
        val ScriptParsed = "$domain.scriptParsed"
        val SetAsyncCallStackDepth = "$domain.setAsyncCallStackDepth"
        val SetBreakpointsActive = "$domain.setBreakpointsActive"
        val SetBreakpointByUrl = "$domain.setBreakpointByUrl"
        val SetPauseOnExceptions = "$domain.setPauseOnExceptions"
        val SetSkipAllPauses = "$domain.setSkipAllPauses"
        val StepInto = "$domain.stepInto"
        val StepOut = "$domain.stepOut"
        val StepOver = "$domain.stepOver"
    }
    object Runtime{
        private val domain = "Runtime"
        val Enable = "$domain.enable"
        val GetProperties = "$domain.getProperties"
        val RunIfWaitingForDebugger = "$domain.runIfWaitingForDebugger"
    }
}