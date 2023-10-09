# Kodular JSON Parser Extension

## Overview

This Kodular extension is designed to simplify JSON parsing within your Kodular projects. It provides a set of blocks that enable you to easily work with JSON data.

### Features

- Parse JSON strings into Kodular variables.
- Access JSON values by key.
- Traverse JSON arrays and objects with ease.

## Installation

To use this extension in your Kodular project, follow these steps:

1. Download the latest release from the [Releases](https://github.com/emabo/JSONParserExtension/releases) section of this GitHub repository.
2. In your Kodular project, go to the "Extensions" section.
3. Click on the "Import Extension" button.
4. Upload the downloaded extension file (`jsonparser.kodular.aix`).
5. The extension will be added to your project.

## Usage

### Parsing JSON

To parse a JSON string, use the `ParseJSON` block:

```blocks
JSON Parser Extension
    ParseJSON [JSONString]
```

- `JSONString` should contain the JSON data as a string.

### Accessing JSON Values

Once you have parsed the JSON, you can access its values using the `GetIntegerValue` block:

```blocks
JSON Parser Extension
    GetIntegerValue [attributeName] and store in [destinationVariable]
```

- `attributeName` is the key of the JSON value you want to retrieve.
- `destinationVariable` is where the retrieved value will be stored.


```blocks
JSON Parser Extension
    GetStringValue [attributeName] and store in [destinationVariable]
```

- `attributeName` is the key of the JSON value you want to retrieve.
- `destinationVariable` is where the retrieved value will be stored.


```blocks
JSON Parser Extension
    GetDoubleValue [attributeName] and store in [destinationVariable]
```

- `attributeName` is the key of the JSON value you want to retrieve.
- `destinationVariable` is where the retrieved value will be stored.


```blocks
JSON Parser Extension
    OpenJSONObject [JSONString]
```

- `JSONString` is the key of the JSON object you want to traverse.


```blocks
JSON Parser Extension
    OpenJSONArray [JSONString]
```

- `JSONString` is the key of the JSON array you want to traverse.


```blocks
JSON Parser Extension
    OpenObjectInArrayByIndex [index]
```

- `index` is the index of the JSON object you want to traverse.


```blocks
JSON Parser Extension
    OpenArrayInArrayByIndex [index]
```

- `index` is the index of the JSON array you want to traverse.


### Example

Here's a simple example of parsing JSON and accessing its values:

```blocks
When Screen1.Initialize
    JSON Parser Extension
        ParseJSON "{\"name\":\"John\",\"age\":30,\"height\":\"1.78\"}"
    JSON Parser Extension
        GetStringValue "name" and store in global Name
    JSON Parser Extension
        GetIntegerValue "age" and store in global Age
    JSON Parser Extension
        GetDoubleValue "height" and store in global Height
```


In this example, we parse a JSON string, access its values by key, and store them in global variables for later use.

### Blocks

![All blocks of JSONParser extension](https://github.com/emabo/JSONParserExtension/images/blocks.png)

### How to create Kodular extension

[Learn how to create Kodular extensions](https://docs.kodular.io/guides/extensions/create-extensions/)

## Contribution

If you would like to contribute to this project or report issues, please [open an issue](https://github.com/emabo/JSONParserExtension/issues) or submit a pull request.

## License

This extension is released under the [MIT License](LICENSE). Please review the [License](LICENSE) file for more details.
