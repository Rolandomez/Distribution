package typings.sentryTypes

import typings.sentryTypes.typesClientreportMod.EventDropReason
import typings.sentryTypes.typesDatacategoryMod.DataCategory
import typings.sentryTypes.typesDsnMod.DsnProtocol
import typings.sentryTypes.typesEnvelopeMod.EnvelopeItemType
import typings.sentryTypes.typesEventMod._EventType
import typings.sentryTypes.typesInstrumenterMod.Instrumenter
import typings.sentryTypes.typesMeasurementMod.DurationUnit
import typings.sentryTypes.typesMeasurementMod.FractionUnit
import typings.sentryTypes.typesMeasurementMod.InformationUnit
import typings.sentryTypes.typesMeasurementMod.NoneUnit
import typings.sentryTypes.typesReplayMod.ReplayRecordingMode
import typings.sentryTypes.typesSessionMod.RequestSessionStatus
import typings.sentryTypes.typesSessionMod.SessionStatus
import typings.sentryTypes.typesSeverityMod.SeverityLevel
import typings.sentryTypes.typesTransactionMod.TransactionSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sentryTypesStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with DataCategory
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait _empty
    extends StObject
       with NoneUnit
  inline def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait abnormal
    extends StObject
       with SessionStatus
  inline def abnormal: abnormal = "abnormal".asInstanceOf[abnormal]
  
  @js.native
  sealed trait attachment
    extends StObject
       with DataCategory
       with EnvelopeItemType
  inline def attachment: attachment = "attachment".asInstanceOf[attachment]
  
  @js.native
  sealed trait before_send
    extends StObject
       with EventDropReason
  inline def before_send: before_send = "before_send".asInstanceOf[before_send]
  
  @js.native
  sealed trait bit
    extends StObject
       with InformationUnit
  inline def bit: bit = "bit".asInstanceOf[bit]
  
  @js.native
  sealed trait buffer
    extends StObject
       with ReplayRecordingMode
  inline def buffer: buffer = "buffer".asInstanceOf[buffer]
  
  @js.native
  sealed trait byte
    extends StObject
       with InformationUnit
  inline def byte: byte = "byte".asInstanceOf[byte]
  
  @js.native
  sealed trait check_in
    extends StObject
       with EnvelopeItemType
  inline def check_in: check_in = "check_in".asInstanceOf[check_in]
  
  @js.native
  sealed trait client_report
    extends StObject
       with EnvelopeItemType
  inline def client_report: client_report = "client_report".asInstanceOf[client_report]
  
  @js.native
  sealed trait component
    extends StObject
       with TransactionSource
  inline def component: component = "component".asInstanceOf[component]
  
  @js.native
  sealed trait crashed
    extends StObject
       with RequestSessionStatus
       with SessionStatus
  inline def crashed: crashed = "crashed".asInstanceOf[crashed]
  
  @js.native
  sealed trait crontab extends StObject
  inline def crontab: crontab = "crontab".asInstanceOf[crontab]
  
  @js.native
  sealed trait custom
    extends StObject
       with TransactionSource
  inline def custom: custom = "custom".asInstanceOf[custom]
  
  @js.native
  sealed trait day
    extends StObject
       with DurationUnit
  inline def day: day = "day".asInstanceOf[day]
  
  @js.native
  sealed trait debug
    extends StObject
       with SeverityLevel
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait error
    extends StObject
       with DataCategory
       with SeverityLevel
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait errored
    extends StObject
       with RequestSessionStatus
  inline def errored: errored = "errored".asInstanceOf[errored]
  
  @js.native
  sealed trait event
    extends StObject
       with EnvelopeItemType
  inline def event: event = "event".asInstanceOf[event]
  
  @js.native
  sealed trait event_processor
    extends StObject
       with EventDropReason
  inline def event_processor: event_processor = "event_processor".asInstanceOf[event_processor]
  
  @js.native
  sealed trait exabyte
    extends StObject
       with InformationUnit
  inline def exabyte: exabyte = "exabyte".asInstanceOf[exabyte]
  
  @js.native
  sealed trait exbibyte
    extends StObject
       with InformationUnit
  inline def exbibyte: exbibyte = "exbibyte".asInstanceOf[exbibyte]
  
  @js.native
  sealed trait exited
    extends StObject
       with SessionStatus
  inline def exited: exited = "exited".asInstanceOf[exited]
  
  @js.native
  sealed trait fatal
    extends StObject
       with SeverityLevel
  inline def fatal: fatal = "fatal".asInstanceOf[fatal]
  
  @js.native
  sealed trait finishTransaction extends StObject
  inline def finishTransaction: finishTransaction = "finishTransaction".asInstanceOf[finishTransaction]
  
  @js.native
  sealed trait gigabyte
    extends StObject
       with InformationUnit
  inline def gigabyte: gigabyte = "gigabyte".asInstanceOf[gigabyte]
  
  @js.native
  sealed trait hour
    extends StObject
       with DurationUnit
  inline def hour: hour = "hour".asInstanceOf[hour]
  
  @js.native
  sealed trait http
    extends StObject
       with DsnProtocol
  inline def http: http = "http".asInstanceOf[http]
  
  @js.native
  sealed trait https
    extends StObject
       with DsnProtocol
  inline def https: https = "https".asInstanceOf[https]
  
  @js.native
  sealed trait in_progress extends StObject
  inline def in_progress: in_progress = "in_progress".asInstanceOf[in_progress]
  
  @js.native
  sealed trait info
    extends StObject
       with SeverityLevel
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait internal
    extends StObject
       with DataCategory
  inline def internal: internal = "internal".asInstanceOf[internal]
  
  @js.native
  sealed trait internal_sdk_error
    extends StObject
       with EventDropReason
  inline def internal_sdk_error: internal_sdk_error = "internal_sdk_error".asInstanceOf[internal_sdk_error]
  
  @js.native
  sealed trait interval extends StObject
  inline def interval: interval = "interval".asInstanceOf[interval]
  
  @js.native
  sealed trait kibibyte
    extends StObject
       with InformationUnit
  inline def kibibyte: kibibyte = "kibibyte".asInstanceOf[kibibyte]
  
  @js.native
  sealed trait kilobyte
    extends StObject
       with InformationUnit
  inline def kilobyte: kilobyte = "kilobyte".asInstanceOf[kilobyte]
  
  @js.native
  sealed trait landscape extends StObject
  inline def landscape: landscape = "landscape".asInstanceOf[landscape]
  
  @js.native
  sealed trait log
    extends StObject
       with SeverityLevel
  inline def log: log = "log".asInstanceOf[log]
  
  @js.native
  sealed trait mebibyte
    extends StObject
       with InformationUnit
  inline def mebibyte: mebibyte = "mebibyte".asInstanceOf[mebibyte]
  
  @js.native
  sealed trait megabyte
    extends StObject
       with InformationUnit
  inline def megabyte: megabyte = "megabyte".asInstanceOf[megabyte]
  
  @js.native
  sealed trait microsecond
    extends StObject
       with DurationUnit
  inline def microsecond: microsecond = "microsecond".asInstanceOf[microsecond]
  
  @js.native
  sealed trait millisecond
    extends StObject
       with DurationUnit
  inline def millisecond: millisecond = "millisecond".asInstanceOf[millisecond]
  
  @js.native
  sealed trait minute
    extends StObject
       with DurationUnit
  inline def minute: minute = "minute".asInstanceOf[minute]
  
  @js.native
  sealed trait monitor
    extends StObject
       with DataCategory
  inline def monitor: monitor = "monitor".asInstanceOf[monitor]
  
  @js.native
  sealed trait month extends StObject
  inline def month: month = "month".asInstanceOf[month]
  
  @js.native
  sealed trait nanosecond
    extends StObject
       with DurationUnit
  inline def nanosecond: nanosecond = "nanosecond".asInstanceOf[nanosecond]
  
  @js.native
  sealed trait network_error
    extends StObject
       with EventDropReason
  inline def network_error: network_error = "network_error".asInstanceOf[network_error]
  
  @js.native
  sealed trait none
    extends StObject
       with NoneUnit
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait ok
    extends StObject
       with RequestSessionStatus
       with SessionStatus
  inline def ok: ok = "ok".asInstanceOf[ok]
  
  @js.native
  sealed trait otel
    extends StObject
       with Instrumenter
  inline def otel: otel = "otel".asInstanceOf[otel]
  
  @js.native
  sealed trait percent
    extends StObject
       with FractionUnit
  inline def percent: percent = "percent".asInstanceOf[percent]
  
  @js.native
  sealed trait petabyte
    extends StObject
       with InformationUnit
  inline def petabyte: petabyte = "petabyte".asInstanceOf[petabyte]
  
  @js.native
  sealed trait portrait extends StObject
  inline def portrait: portrait = "portrait".asInstanceOf[portrait]
  
  @js.native
  sealed trait profile
    extends StObject
       with DataCategory
       with EnvelopeItemType
       with _EventType
  inline def profile: profile = "profile".asInstanceOf[profile]
  
  @js.native
  sealed trait queue_overflow
    extends StObject
       with EventDropReason
  inline def queue_overflow: queue_overflow = "queue_overflow".asInstanceOf[queue_overflow]
  
  @js.native
  sealed trait ratelimit_backoff
    extends StObject
       with EventDropReason
  inline def ratelimit_backoff: ratelimit_backoff = "ratelimit_backoff".asInstanceOf[ratelimit_backoff]
  
  @js.native
  sealed trait ratio
    extends StObject
       with FractionUnit
  inline def ratio: ratio = "ratio".asInstanceOf[ratio]
  
  @js.native
  sealed trait replay
    extends StObject
       with DataCategory
  inline def replay: replay = "replay".asInstanceOf[replay]
  
  @js.native
  sealed trait replay_event
    extends StObject
       with EnvelopeItemType
       with _EventType
  inline def replay_event: replay_event = "replay_event".asInstanceOf[replay_event]
  
  @js.native
  sealed trait replay_recording
    extends StObject
       with EnvelopeItemType
  inline def replay_recording: replay_recording = "replay_recording".asInstanceOf[replay_recording]
  
  @js.native
  sealed trait route
    extends StObject
       with TransactionSource
  inline def route: route = "route".asInstanceOf[route]
  
  @js.native
  sealed trait sample_rate
    extends StObject
       with EventDropReason
  inline def sample_rate: sample_rate = "sample_rate".asInstanceOf[sample_rate]
  
  @js.native
  sealed trait second
    extends StObject
       with DurationUnit
  inline def second: second = "second".asInstanceOf[second]
  
  @js.native
  sealed trait security
    extends StObject
       with DataCategory
  inline def security: security = "security".asInstanceOf[security]
  
  @js.native
  sealed trait send_error
    extends StObject
       with EventDropReason
  inline def send_error: send_error = "send_error".asInstanceOf[send_error]
  
  @js.native
  sealed trait sentry
    extends StObject
       with Instrumenter
  inline def sentry: sentry = "sentry".asInstanceOf[sentry]
  
  @js.native
  sealed trait session
    extends StObject
       with DataCategory
       with EnvelopeItemType
       with ReplayRecordingMode
  inline def session: session = "session".asInstanceOf[session]
  
  @js.native
  sealed trait sessions
    extends StObject
       with EnvelopeItemType
  inline def sessions: sessions = "sessions".asInstanceOf[sessions]
  
  @js.native
  sealed trait sourcemap extends StObject
  inline def sourcemap: sourcemap = "sourcemap".asInstanceOf[sourcemap]
  
  @js.native
  sealed trait startTransaction extends StObject
  inline def startTransaction: startTransaction = "startTransaction".asInstanceOf[startTransaction]
  
  @js.native
  sealed trait task
    extends StObject
       with TransactionSource
  inline def task: task = "task".asInstanceOf[task]
  
  @js.native
  sealed trait tebibyte
    extends StObject
       with InformationUnit
  inline def tebibyte: tebibyte = "tebibyte".asInstanceOf[tebibyte]
  
  @js.native
  sealed trait terabyte
    extends StObject
       with InformationUnit
  inline def terabyte: terabyte = "terabyte".asInstanceOf[terabyte]
  
  @js.native
  sealed trait transaction
    extends StObject
       with DataCategory
       with EnvelopeItemType
       with _EventType
  inline def transaction: transaction = "transaction".asInstanceOf[transaction]
  
  @js.native
  sealed trait url
    extends StObject
       with TransactionSource
  inline def url: url = "url".asInstanceOf[url]
  
  @js.native
  sealed trait user_report
    extends StObject
       with EnvelopeItemType
  inline def user_report: user_report = "user_report".asInstanceOf[user_report]
  
  @js.native
  sealed trait view
    extends StObject
       with TransactionSource
  inline def view: view = "view".asInstanceOf[view]
  
  @js.native
  sealed trait warning
    extends StObject
       with SeverityLevel
  inline def warning: warning = "warning".asInstanceOf[warning]
  
  @js.native
  sealed trait wasm extends StObject
  inline def wasm: wasm = "wasm".asInstanceOf[wasm]
  
  @js.native
  sealed trait week
    extends StObject
       with DurationUnit
  inline def week: week = "week".asInstanceOf[week]
  
  @js.native
  sealed trait year extends StObject
  inline def year: year = "year".asInstanceOf[year]
}
