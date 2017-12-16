package com.rsqtechnologies.health.infrastructure.converters

import java.time.Duration
import javax.persistence.AttributeConverter
import javax.persistence.Converter

@Converter(autoApply = true)
class DurationAttributeConverter : AttributeConverter<Duration, Long> {

    override fun convertToDatabaseColumn(duration: Duration?): Long? {
        return duration?.seconds
    }

    override fun convertToEntityAttribute(dbData: Long?): Duration? {
        return if (dbData == null) null else Duration.ofSeconds(dbData)
    }
}