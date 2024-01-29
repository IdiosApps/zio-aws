package zio.aws.http4sEmber

import scala.concurrent.duration.Duration

case class EmberClientConfig(
    timeout: Duration,
    idleTimeout: Duration,
//    requestTimeout: Duration,
//    connectTimeout: Duration,
//    userAgent: `User-Agent`,
//    maxTotalConnections: Int,
//    maxWaitQueueLimit: Int,
//    checkEndpointIdentification: Boolean,
//    maxResponseLineSize: Int,
//    maxHeaderLength: Int,
//    maxChunkSize: Int,
//    chunkBufferMaxSize: Int,
//    parserMode: ParserMode,
//    bufferSize: Int,
//    channelOptions: ChannelOptions
)
