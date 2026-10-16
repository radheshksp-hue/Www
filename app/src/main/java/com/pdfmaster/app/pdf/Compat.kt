package com.pdfmaster.app.pdf

// Compatibility shim: defines POPUP used by older project zips.
// If the code expects POPUP to be another type (enum/int/etc.), update this accordingly.
@Suppress("unused")
const val POPUP: String = "popup"
