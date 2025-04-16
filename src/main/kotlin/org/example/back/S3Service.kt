package org.example.back

import software.amazon.awssdk.services.s3.S3Client

interface S3Service {
    fun getBucketNames(): List<String>
}