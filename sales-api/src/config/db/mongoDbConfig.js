import mongoose from 'mongoose';

import { MONGO_DB_URL } from '../constants/secrets.js';

export function connectMongoDb(){
    mongoose.connect(MONGO_DB_URL, {
        useNewUrlParser: true,
    });
    mongoose.connection.on('connected', function(){
        console.info('---> The application connected to MongoDB successfuly.')
    });
    mongoose.connection.on('error', function(){
        console.error('---> The application was not connected to MongoDB.')
    });
}