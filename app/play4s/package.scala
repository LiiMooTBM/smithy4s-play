import play.api.mvc.{Headers, Request, RequestHeader}
import smithy4s.http.{CaseInsensitive, HttpMethod}

package object play4s {


  def getHeaders(req: RequestHeader) =
    req.headers.headers.groupBy(_._1).map { case (k, v) =>
      (CaseInsensitive(k), v.map(_._2))
    }

}
