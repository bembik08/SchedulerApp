package com.teck.schedulerapp.data.datasource

import com.teck.schedulerapp.R
import com.teck.schedulerapp.data.model.Classes
import com.teck.schedulerapp.data.model.HomeWork
import com.teck.schedulerapp.data.model.Lesson

fun getMockData(): Classes = Classes(
    "First",
    lessons = listOf(
        Lesson(
            title = "History",
            dateStart = "05/04/2022 10:00",
            image = R.drawable.icons8_man_student_48,
            false
        ),
        Lesson(
            title = "Literature",
            dateStart = "05/04/2022 12:00",
            image = R.drawable.icons8_man_student_48,
            false
        ),
        Lesson(
            title = "Physics",
            dateStart = "07/04/2022 10:00",
            image = R.drawable.icons8_man_student_48,
            false
        ),
        Lesson(
            title = "History",
            dateStart = "07/04/2022 12:00",
            image = R.drawable.icons8_man_student_48,
            true
        ),
        Lesson(
            title = "Literature",
            dateStart = "08/04/2022 10:00",
            image = R.drawable.icons8_man_student_48,
            false
        ),
        Lesson(
            title = "Physics",
            dateStart = "08/04/2022 12:00",
            image = R.drawable.icons8_man_student_48,
            true
        )
    ),
    homeworks = listOf(
        HomeWork(
            title = "Physics",
            dateStart = "06/04/2022 19:00",
            image = R.drawable.icons8_man_student_48,
            task = "Do homework Physics"
        ),
        HomeWork(
            title = "Literature",
            dateStart = "04/04/2022 19:00",
            image = R.drawable.icons8_man_student_48,
            task = "Do homework Literature"
        ),
        HomeWork(
            title = "Literature",
            dateStart = "07/04/2022 19:00",
            image = R.drawable.icons8_man_student_48,
            task = "Do homework Literature"
        ),
        HomeWork(
            title = "Physics",
            dateStart = "07/04/2022 20:00",
            image = R.drawable.icons8_man_student_48,
            task = "Do homework Physics"
        ),
        HomeWork(
            title = "Literature",
            dateStart = "10/04/2022 20:00",
            image = R.drawable.icons8_man_student_48,
            task = "Do homework Literature"
        ),
        HomeWork(
            title = "Literature",
            dateStart = "12/04/2022 20:00",
            image = R.drawable.icons8_man_student_48,
            task = "Do homework Literature"
        )
    )
)