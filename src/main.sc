require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: Hello
        intent!: /hello
        a: Привет человек

    state: Weather
        intent!: /weather
        a: Сейчас отличная погода!
        
    state: Currency
        intent!: /currency
        a: Курс 80р за доллар

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}