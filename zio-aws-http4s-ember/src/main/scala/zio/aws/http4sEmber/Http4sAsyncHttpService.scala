package zio.aws.http4sEmber

import zio.aws.http4sEmber.Http4sEmberClient.Http4sEmberClientBuilder
import software.amazon.awssdk.http.async.SdkAsyncHttpService

class Http4sAsyncHttpService extends SdkAsyncHttpService {
  override def createAsyncHttpClientFactory(): Http4sEmberClientBuilder =
    Http4sEmberClient.builder()
}
