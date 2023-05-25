<template>

    <v-card outlined>
        <v-card-title>
            UploadAsset
        </v-card-title>

        <v-card-text>
            <String label="FilePath" v-model="value.filePath" :editMode="editMode"/>
            <String label="FileType" v-model="value.fileType" :editMode="editMode"/>
            <String label="Filename" v-model="value.filename" :editMode="editMode"/>
            <Number label="FileSize" v-model="value.fileSize" :editMode="editMode"/>
            <String label="CreatedBy" v-model="value.createdBy" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="uploadAsset"
            >
                UploadAsset
            </v-btn>
            
            <v-btn
                    color="deep-purple lighten-2"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'UploadAssetCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.filePath = '';
            this.value.fileType = '';
            this.value.filename = '';
            this.value.fileSize = 0;
            this.value.createdBy = '';
        },
        watch: {
        },
        methods: {
            uploadAsset() {
                this.$emit('uploadAsset', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

