package rawin.da.lib

data class CommonResponse<T>(
    val status: String, val result: T?, val results: List<T>?
) {
    companion object {
        fun <R> success(r: R) = CommonResponse("success", r, null)
        fun <R> success(r: List<R>) = CommonResponse("success", null, r)
    }
}
